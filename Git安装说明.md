# Git 安装说明（本机已完成 ✅）

> 安装日期：2026-09-18
> **Git 已经装好了，不用你自己装。** 这份文档记录装在哪、怎么验证、以及你接下来要做什么。

---

## 一、安装结果

| 项目 | 值 |
| --- | --- |
| 版本 | **git 2.51.0.windows.1** |
| 安装位置 | **`D:\Git`**（按你要求装在 D 盘，375 MB） |
| 命令行入口 | `D:\Git\cmd\git.exe` |
| 已加入用户 PATH | ✅ `D:\Git\cmd` |
| 全局配置文件 | `C:\Users\shi'yu'jie\.gitconfig`（只有几百字节） |
| 全局忽略规则 | `D:\Git\etc\gitignore_global`（已配好 Java/Python/密钥规则） |
| 安装包 | 已删除（原本 61.7 MB，不占地方） |

**说明**：`D:\Program Files\Git` 是受保护目录，建不了，所以装在了 `D:\Git`。
装 Git 用的是**用户级安装**（不需要管理员权限），所以没弹 UAC。

### 已经帮你配好的全局设置

```ini
core.autocrlf = true              # Windows 换行符自动转换，避免和 Linux 协作时全文件 diff
core.quotepath = false            # 中文文件名不乱码（重要！）
i18n.commitEncoding = utf-8       # 提交信息用 UTF-8
init.defaultBranch = master       # 新建仓库默认分支（Gitee 用 master；GitHub 用 main）
core.excludesFile = D:/Git/etc/gitignore_global   # 全局忽略规则
credential.helper = manager       # 记住账号密码，不用每次输
```

---

## 二、⚠️ 现在必须做一件事：重开终端

**PATH 是终端启动时读一次的。** 你现在开着的终端（PowerShell / CMD / IDEA）**还认不出 `git` 命令**。

**解决办法：全部关掉，重新打开。**

重开之后验证：

```powershell
git --version
# 应该输出：git version 2.51.0.windows.1
```

### IDEA 已配好 Git 路径（2026-09-18 完成）

在 `%APPDATA%\JetBrains\IntelliJIdea2026.1\options\git.xml` 里已经把 Git 路径钉死：

```json
{
    "@version": 4,
    "pathToGit": "D:/Git/cmd/git.exe",
    "author": { "name": "qing070602", "email": "3596277589@qq.com" }
}
```

**这样就算 IDEA 读到的 PATH 是旧的，也能找到 Git。** 验证方法：

```
IDEA → File → Settings → Version Control → Git
「Path to Git executable」应该显示 D:\Git\cmd\git.exe
点右边 Test → 弹出 "Git executed successfully. Git version is 2.51.0"
```

> [!warning] ⚠️ 光重启 IDEA 可能不够，原因在这里
> Windows 上「开始菜单 / 桌面快捷方式」启动的程序，环境变量是从 **explorer.exe（资源管理器）** 继承的，
> 而 explorer 是在**你开机时**启动的 —— 比你装 Git 早得多。
> 所以 explorer 手里的 PATH 还是旧的，从它启动的 IDEA 自然也继承旧 PATH。
>
> **两种解决方式（选一个）：**
>
> | 方式 | 操作 | 彻底程度 |
> | --- | --- | --- |
> | **A. 手动指定路径（推荐，一劳永逸）** | 上面那个 git.xml 已经配好了；万一 IDEA 里 Git 还是灰的，就去 Settings 里手动填 `D:\Git\cmd\git.exe` | 只解决 IDEA，但够用 |
> | **B. 注销并重新登录**（或重启电脑） | 开始菜单 → 头像 → 注销 → 重新登录 | **彻底**，所有程序都能用 `git` 命令 |
>
> 建议：**先把 IDEA 的路径手动配上（方式 A）继续干活，等有空了注销重登一次（方式 B）**，
> 之后在任何地方敲 `git` 都能用。

---

## 三、你接下来要做的（3 步）

### 第 1 步：设置你的身份（必须，否则 commit 会失败）

```powershell
git config --global user.name "青070602"
git config --global user.email "你的邮箱"
```

- `user.name` 建议就用你 GitHub / Gitee 的用户名
- `user.email` **必须和你代码托管平台注册的邮箱一致**，否则提交不会算到你账号头上（绿格子墙不亮）

验证：

```powershell
git config --global --list
```

### 第 2 步：配 SSH 免密（推荐，一次配置永久不用输密码）

```powershell
# 生成密钥（连续按 3 次回车，密码留空）
ssh-keygen -t ed25519 -C "你的邮箱"

# 复制公钥到剪贴板
Get-Content $env:USERPROFILE\.ssh\id_ed25519.pub | Set-Clipboard
```

然后：
- **GitHub**：头像 → Settings → SSH and GPG keys → New SSH key → 粘贴 → Add
- **Gitee**：`gitee.com/profile/sshkeys` → 新建 → 粘贴 → 确定

测试：

```powershell
ssh -T git@github.com     # GitHub
ssh -T git@gitee.com      # Gitee
```

看到 `Hi 你的用户名! You've successfully authenticated` 就成功。

> 本机的 `ssh` 命令是系统自带的（OpenSSH_for_Windows_9.5p1），可以直接用。

### 第 3 步：开始推代码

具体命令见 [`Gitee推送指南.md`](Gitee推送指南.md)（GitHub 流程几乎一样，差别就两处：远程地址换成 `git@github.com:用户名/仓库名.git`，默认分支用 `main`）。

**日常就三条**：

```powershell
git add .
git commit -m "feat: 完成数组练习"
git push
```

---

## 四、常见问题

| 现象 | 原因 | 解决 |
| --- | --- | --- |
| `git : 无法将"git"项识别为...` | 终端是装 Git 之前开的 | **关掉重开**（PATH 是启动快照） |
| IDEA 里 Git 菜单是灰的 | IDEA 没重启 | 重启 IDEA，手动指定 `D:\Git\cmd\git.exe` |
| `Please tell me who you are` | 没配 user.name / user.email | 回到第三节第 1 步 |
| `Permission denied (publickey)` | SSH 没配好 | 回到第三节第 2 步；确认远程地址是 `git@` 开头 |
| 提交后 GitHub 上没显示我的头像/绿格子 | 邮箱和平台注册邮箱不一致 | `git config --global user.email` 改成注册邮箱 |
| 中文文件名显示成 `\346\226\207` | quotepath 问题 | 已经帮你配好 `core.quotepath=false`，正常不会有 |

---

## 五、自己验证 Git 是否真的可用（可选）

想亲自确认一遍，把下面整段贴进 PowerShell：

```powershell
cd $env:TEMP
mkdir _git_test -Force | Out-Null
cd _git_test
D:\Git\cmd\git.exe init
echo "# 测试" > README.md
D:\Git\cmd\git.exe add .
D:\Git\cmd\git.exe commit -m "test: 验证 Git"
D:\Git\cmd\git.exe log --oneline
cd ..
Remove-Item _git_test -Recurse -Force
```

看到一行 `test: 验证 Git` 的提交记录，就说明完全正常。

> 我在安装后已经跑过这个测试，结果是：
> `[master (root-commit) b88f4fb] test: 验证 Git 可用` ✅

---

## 六、安全提醒（顺便说一次）

全局忽略规则 `D:\Git\etc\gitignore_global` 里已经帮你挡掉了：

```
.env  /  application-local.yml  /  *.pem  /  *.key  /  *credentials*.json
```

**永远不要把 API Key、数据库密码推到公开仓库。**
后面学 LLM 时会用到 OpenAI / DeepSeek 的 Key，写到 `.env` 里，`.gitignore` 会自动挡住。
一旦推到公网，机器人几秒钟就能扫到并盗刷 —— 这条现在记住，能省你几千块。

---

*安装记录：2026-09-18 ｜ 目标位置由你指定为 D 盘*
