# Git / GitHub 上手指南（零基础版）

> 目标：**30 分钟内把自己的代码推到 GitHub，并且以后每天只敲 3 条命令。**
> 你现在这台电脑**还没装 Git**（我检查过了），所以从第一步开始。

---

## 一、装 Git for Windows（5 分钟）

1. 打开 https://git-scm.com/download/win —— 会自动开始下载
2. 双击安装，**一路点「Next」用默认选项就行**，只有一个地方要注意：
   - 遇到 **"Choosing the default editor"** 时，如果默认是 Vim，**改成 Notepad** 或 VS Code
     （Vim 新手进去就出不来，`Esc` + `:wq` 才能退出）
3. 装完**必须重开一个终端**（PowerShell / CMD），否则识别不到命令
4. 验证：

```powershell
git --version
# 应该输出类似：git version 2.51.0.windows.1
```

---

## 二、配置身份（2 分钟，只做一次）

Git 会在每次提交里记录"是谁提交的"，所以必须先设：

```powershell
git config --global user.name "你的名字或昵称"
git config --global user.email "你的邮箱@example.com"
```

> [!tip] 邮箱建议用注册 GitHub 的那个邮箱
> 这样 GitHub 才能把提交算到你账号头上（否则绿格子墙不亮）。

再设两个让中文不乱码的配置：

```powershell
git config --global core.quotepath false
git config --global i18n.commitEncoding utf-8
```

验证：

```powershell
git config --global --list
```

---

## 三、配 SSH 密钥（10 分钟，一次配置永久免密）

> 不配也能用，但每次 push 都要输账号密码（而且 GitHub 早就不能用密码了，只能用 Token）。
> **配 SSH 是一劳永逸的做法，强烈建议现在配好。**

### 1. 生成密钥

```powershell
ssh-keygen -t ed25519 -C "你的邮箱@example.com"
```

连续按 **3 次回车**（路径用默认，密码留空）。看到一堆 `+----+` 图案就是成功了。

### 2. 复制公钥

```powershell
Get-Content $env:USERPROFILE\.ssh\id_ed25519.pub | Set-Clipboard
```

（这条命令直接把公钥复制到剪贴板了）

### 3. 贴到 GitHub

1. 登录 GitHub → 右上角头像 → **Settings**
2. 左侧栏 → **SSH and GPG keys**
3. 点 **New SSH key**
4. Title 随便填（比如 `我的笔记本`），Key 那一栏 **Ctrl+V 粘贴**
5. 点 **Add SSH key**

### 4. 测试

```powershell
ssh -T git@github.com
```

第一次会问 `Are you sure you want to continue connecting?`，输入 **yes** 回车。

看到 `Hi 你的用户名! You've successfully authenticated...` —— **成功**。

> [!warning] 如果报错 `ssh: command not found`
> 说明装 Git 时没勾选 SSH 组件，或者没重开终端。先试重开终端；还不行就重新装 Git，勾选 "Use OpenSSH"。

---

## 四、在 GitHub 网页建仓库（2 分钟）

1. 登录 GitHub → 右上角 **+** → **New repository**
2. **Repository name** 填：`java-learning`
3. **Description** 填：`我的 Java / 算法 / AI Agent 学习代码库`
4. 选 **Public**（公开）—— 求职仓库必须公开，否则面试官看不到
5. ⚠️ **千万不要勾** "Add a README file" / "Add .gitignore" / "Choose a license"
   —— 因为本地已经有文件了，勾了会造成冲突，新手很容易卡在这
6. 点 **Create repository**
7. 建好后页面会显示一串命令，**先别管它**，看下一步

---

## 五、推送本地代码（5 分钟）

打开终端，进入仓库文件夹（**注意：是你的仓库文件夹，不是这个 `D:\ds\java-learning` 骨架**）：

```powershell
cd D:\你的路径\java-learning
```

> [!important] 先决定：用哪个文件夹当仓库
> 你现在有两个选择：
> - **A. 直接用骨架**：把 `D:\ds\java-learning` 整个复制到 `D:\code\java-learning`，在那里写代码
> - **B. 另建一个**：自己在 IDE 里建项目，按骨架的目录结构组织
>
> 推荐 **A**，省事，目录结构已经搭好了。

然后依次执行：

```powershell
# 1. 初始化本地仓库
git init

# 2. 把默认分支改名为 main（GitHub 的默认叫 main，保持一致）
git branch -M main

# 3. 把所有文件加入暂存区
git add .

# 4. 提交一次
git commit -m "init: 仓库初始化，建立目录结构"

# 5. 关联远程仓库（把 你的用户名 换成你的 GitHub 用户名）
git remote add origin git@github.com:你的用户名/java-learning.git

# 6. 推送
git push -u origin main
```

刷新 GitHub 页面 —— **你的代码上去了**。

---

## 六、以后的日常（每天就这 3 条）

```powershell
git add .
git commit -m "feat: 完成数组-二分查找练习"
git push
```

**就这三条。记住它们，你就不需要学任何其他 Git 命令。**

### commit message 怎么写

不用学 Conventional Commits，记住三种前缀：

| 前缀 | 什么时候用 | 例子 |
| --- | --- | --- |
| `feat:` | 加了新代码 / 新功能 | `feat: 新增图书管理系统借阅功能` |
| `fix:` | 修了 bug | `fix: 修复除零异常` |
| `docs:` | 只改文档 / README | `docs: 更新进度看板` |

> [!tip] 别写 "update" "修改" 这种废话
> 半年后你看 `git log`，`fix: 修复空指针` 一眼就知道当时在干嘛，
> `update` 你完全想不起来。

---

## 七、新手最常踩的 6 个坑

| 现象 | 原因 | 解决 |
| --- | --- | --- |
| `git: 无法识别` | 装完没重开终端 | 关掉终端重新打开 |
| `remote origin already exists` | 重复执行了 `remote add` | 先 `git remote remove origin` 再重新 add |
| `failed to push some refs` | 远程有本地没有的提交（建仓库时勾了 README） | `git pull --rebase origin main` 后再 push |
| `Please tell me who you are` | 没配 user.name / user.email | 回到第二节配置 |
| `Permission denied (publickey)` | SSH 没配好 | 回第三节重配，或确认 remote 地址是 `git@` 开头而不是 `https://` |
| 传了不该传的文件（密码、.class） | 没配 `.gitignore` | 骨架里已经配好了；如果不小心传了密码，**立刻去平台改密码**，光删文件没用（历史记录里还在） |

### 忘了几条命令怎么办

```powershell
git status          # 看当前状态（最常用，不知道干啥就敲它）
git log --oneline   # 看提交历史
git diff            # 看改了什么
```

---

## 八、IDEA 里怎么做（可选）

你以后大概率在 IDEA 里写代码，其实不用敲命令：

1. IDEA 打开仓库文件夹
2. 右上角 **Git** 菜单 → **Commit**（或 `Ctrl + K`）
3. 勾选要提交的文件，写 commit message，点 **Commit**
4. `Ctrl + Shift + K` → **Push**

> 但**前两周请用命令行练手**。命令行的好处是：任何电脑、任何环境都能用，
> 而且出问题时你知道到底发生了什么。IDEA 的按钮报错时你只能干瞪眼。

---

## 九、给自己定个规矩

> **每天至少 push 一次，哪怕只写了一行代码。**

为什么？
半年后招聘方点进你的 GitHub，他看的**不是**你写了多少行，
而是 **"这半年你有没有连续在写"**。

一个 200 天连续提交的绿格子墙，
比 10000 行一次性上传的代码，有说服力得多。

**绿格子墙 = 你的自律可视化。**

---

## 十、下一步

- [ ] 装 Git，配好身份和 SSH
- [ ] 建 GitHub 仓库 `java-learning`
- [ ] 推送骨架，确认网页上能看到文件
- [ ] 今天写的第一段练习代码，用 `git add . && git commit -m "feat: xxx" && git push` 推上去
- [ ] 回到 [[00-AI学习路线总图]] 继续 W01 的任务

---

*配套文档：`README.md`（仓库主页）｜ `D:\ds\Java-Obsidian笔记系统\00-索引\00-AI学习路线总图.md`（学习总纲）*
