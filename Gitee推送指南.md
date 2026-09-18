# 推送到 Gitee（码云）快速上手

> 你已经建好仓库了，但**里面只有 `README.md`，代码还在本地没推上去**。
> 这份文档解决一件事：**把你本地写的东西，按目录结构推上去，并且以后每天只敲 3 条命令。**

---

## 一、先确认：这是 Gitee 还是 GitHub？

你截图里的界面是 **Gitee（码云）**，不是 GitHub。判断依据：

| 截图里的字样 | 只有 Gitee 这么叫 | GitHub 对应叫法 |
| --- | --- | --- |
| `发行作品` | ✅ | Releases |
| `供稿人` | ✅ | Contributors |
| `前往归档` | ✅ | Archive |
| `套餐 / 包` | ✅ | Packages |
| `主要角色` | ✅ | （无此下拉） |
| 语言默认中文 | ✅ | 英文为主 |

**结论：界面没问题，可以正常用。** Gitee 的界面逻辑和 GitHub 基本一致（提交历史、文件列表、README 渲染都在），只是叫法不同。

---

## 二、Gitee 和 GitHub，到底选哪个

| 维度 | Gitee | GitHub |
| --- | --- | --- |
| 国内访问速度 | ✅ 快，不用梯子 | ⚠️ 时快时慢，经常要梯子 |
| 技术面试官认可度 | 🟡 一般 | ✅✅ **更高**，尤其 AI / 外企 / 出海公司 |
| 大厂 HR 看得到 | ✅ 能打开 | ⚠️ 公司网络可能打不开 |
| 平台规模 | 小 | ✅ 全球最大，开源生态在这 |

> ### 👉 给你的建议：**先 Gitee，等有项目了再搬 GitHub**
>
> **现在**（2026 年 9 月，你只有一个 README）：
> 用 Gitee 完全够。方便、快、不掉链子，先把"每天推代码"的习惯养起来最重要。
>
> **明年投简历前**（2027 年 3 月）：**必须有一个 GitHub 账号，把仓库镜像过去。**
> 原因很实在——面试官点开你的 Gitee，可能只看到"哦，他在学 Java"；
> 而简历上挂一个 `github.com/你的用户名` 的链接，**第一印象就不一样**。
>
> **最省事的做法**：两边都推。Gitee 有个功能叫「**仓库镜像管理**」，可以从 GitHub 自动同步，
> 配一次以后只推 GitHub，Gitee 自动跟着更新。（等你到明年 3 月再配，现在别折腾）

---

## 三、公开还是私有？

**选公开（Public）。**

| | 公开 | 私有 |
| --- | --- | --- |
| 面试官能否看到 | ✅ 能 | ❌ **看不到**，你发链接他也打不开 |
| 绿格子墙 / 贡献图 | ✅ 有（求职时很有用） | ❌ 不显示 |
| 代码被抄 | 理论上有风险，但学习代码没人抄 | — |
| 泄露敏感信息 | 需要自己注意（见下） | 相对安全 |

> [!important] 关键认知
> **"公开"本身不是风险，"公开了不该公开的东西"才是风险。**
> 求职仓库**必须公开**，否则整个仓库白建——没人看得到的作品等于不存在。
>
> 真正要守住的只有一条：**别把密钥、密码、公司代码推上去。**
> 骨架里的 `.gitignore` 已经帮你挡掉了 `.env`、`application-local.yml`、`*.pem` 这些。

---

## 四、你现在的仓库状态（需要修一下）

从截图看：

```
青070602 / (仓库名?)
└── README.md      初始提交   ← 只有这一个文件
    README 内容：# Java学习
```

三个问题，都要处理：

| 问题 | 怎么改 |
| --- | --- |
| **仓库里只有 README，没有代码** | 走下面第五、六节，把本地代码推上去 |
| **README 内容太空**（只有「# Java学习」一行） | 换成骨架里那份 `README.md`（有目录结构、进度看板、commit 规范） |
| **没有仓库描述** | 右侧「关于」→ 编辑 → 填：`我的 Java / 算法 / AI Agent 学习代码库` |

> [!tip] 最干净的做法：删掉重建
> 你现在这个仓库只有 1 个提交、内容就一行字，**没有任何不可替代的东西**。
> 建议：**删掉它，重新建一个**，建的时候**不要勾选**「使用 Readme 文件初始化仓库」。
> 这样本地推送时不会和远程的 README 打架，能省掉新手最容易卡住的一类报错。
>
> 不想删也行 —— 第六节讲了怎么处理冲突。

---

## 五、代码到底放在哪（回答你的问题）

**本地放一个文件夹，里面按用途分目录；推的时候整个文件夹一起推。**

### 5.1 本地目录怎么摆

```
D:\code\java-learning\          ← 这个文件夹 = 你的仓库，所有东西都在这
│
├── README.md                   ← 仓库主页（换成骨架里那份）
├── .gitignore                  ← 必须放，挡住 .class 和密钥
├── Git上手指南.md
│
├── java-basics\                ← 🎯 【上课练习题放这里】
│   ├── 01-入门语法\
│   ├── 02-方法\
│   ├── 03-面向对象\
│   └── ...
│
├── algorithm\                  ← 🎯 【洛谷 / 牛客 / LeetCode 放这里】
│   ├── 00-模板.md
│   ├── 01-数组\
│   │   ├── P1001-A+B-Problem-入门.java          ← 洛谷（P 开头）
│   │   └── HJ1-字符串最后一个单词的长度-简单.java  ← 牛客（HJ 开头）
│   ├── 02-链表\
│   └── ...
│
├── mysql-practice\             ← SQL 脚本
├── springboot\                 ← 2027 年 1 月开始
├── ai-agent\                   ← 2027 年 3 月开始（Python / RAG / Agent）
└── projects\                   ← 里程碑项目（能写进简历的）
```

> [!important] 「一个仓库」还是「多个仓库」？
> **现在用一个仓库就够。** 等你 2027 年做 Agent 项目时，再考虑给大项目单独开仓库
> （面试官更愿意点开一个干净的专业项目仓库）。
> 现在不用纠结，**一个仓库反而能体现连续性**。

### 5.2 三类题目分别怎么放

| 来源 | 放哪 | 文件命名 | 备注 |
| --- | --- | --- | --- |
| **上课练习题**（黑马课程） | `java-basics/对应章节/` | `Demo01-键盘录入求和.java`、`练习-数组求最值.java` | ⚠️ **别用 `Demo1` `Test2` 这种名字**，两周后你自己都不知道是什么 |
| **洛谷** | `algorithm/对应题型/` | `P1001-A+B-Problem-入门.java` | `P` = 入门/普及题，`B` = 提高题 |
| **牛客** | `algorithm/对应题型/` | `HJ1-字符串最后一个单词的长度-简单.java`、`NC68-跳台阶-简单.java` | `HJ` = 华为机试，`NC` = 牛客题霸 |
| **LeetCode** | `algorithm/对应题型/` | `0001-两数之和-easy.java` | 题号补零到 4 位 |

**关键原则：按「题型」分目录，不按「来源」分。**
洛谷的二分题和 LeetCode 的二分题放一起，你复习时才能形成对比。

### 5.3 每道题按模板写

用 `algorithm/00-模板.md` 的格式：**题目 → 我的思路（大白话）→ 代码 → 复杂度 → 我踩的坑 → 面试可能追问**。

> [!warning] 两个红线
> 1. **只传公开题库**（洛谷 / LeetCode / 牛客公开题库）。**公司笔试真题绝对不要传** —— 有些是签了保密协议的。
>    牛客的 `HJ`（华为机试）是公开练习题库，可以传；但如果是"某公司 2026 秋招笔试回忆版"，别传。
> 2. **不要原样抄题解**。参考了就写来源链接，然后**自己重写一遍**再推。

---

## 六、现在开始推（具体命令）

> [!note] 前提
> **Git 已经装好了** —— 装在 `D:\Git`，详细情况见 [`Git安装说明.md`](Git安装说明.md)。
> ⚠️ 装完必须**把终端和 IDEA 全部关掉重开**，否则认不出 `git` 命令（PATH 是启动时读一次的）。
> 验证：新开的终端里敲 `git --version`，应输出 `git version 2.51.0.windows.1`。

### 情况 A：你按建议删了旧仓库、新建了空仓库（推荐）

```powershell
# 1. 把骨架复制到你的代码目录（假设你想放在 D:\code）
mkdir D:\code -Force | Out-Null
Copy-Item "D:\ds\java-learning" "D:\code\java-learning" -Recurse -Force
cd D:\code\java-learning

# 2. 初始化
git init
git branch -M master          # Gitee 默认分支叫 master（GitHub 是 main）

# 3. 配身份（只做一次，如果已经配过可跳过）
git config --global user.name "青070602"
git config --global user.email "你的Gitee邮箱"

# 4. 提交
git add .
git commit -m "init: 仓库初始化，建立目录结构"

# 5. 关联远程（把 你的用户名/仓库名 换成实际的）
git remote add origin git@gitee.com:你的用户名/仓库名.git

# 6. 推送
git push -u origin master
```

刷新 Gitee 页面 —— 目录结构全都在了。

### 情况 B：你不想删旧仓库（远程已有 README.md）

远程有一个 README 提交，本地也有一份，直接推会报 `failed to push some refs` 或 `refusing to merge unrelated histories`。

```powershell
cd D:\code\java-learning
git init
git branch -M master
git add .
git commit -m "init: 仓库初始化，建立目录结构"
git remote add origin git@gitee.com:你的用户名/仓库名.git

# 关键：先拉远程，允许合并不相关的历史
git pull origin master --allow-unrelated-histories
# 如果提示 README.md 冲突：手动打开那个文件，删掉 <<<<<<< 和 >>>>>>> 标记，保留你要的内容
git add .
git commit -m "merge: 合并远程 README"

git push -u origin master
```

### 6.1 用 SSH 还是 HTTPS

| | SSH（推荐） | HTTPS |
| --- | --- | --- |
| 地址格式 | `git@gitee.com:用户名/仓库名.git` | `https://gitee.com/用户名/仓库名.git` |
| 认证 | 配一次密钥，永久免密 | 每次要输账号密码 / Token |
| 配置 | 见 [`Git上手指南.md`](Git上手指南.md) 第三节 | 无 |

> Gitee 的 SSH 配置和 GitHub 一模一样，只是把公钥贴到 `gitee.com/profile/sshkeys`。

---

## 七、以后的日常（每天 3 条）

```powershell
cd D:\code\java-learning
git add .
git commit -m "feat: 完成方法章节的递归练习"
git push
```

**就这三条。**

**提交信息怎么写**（不用学复杂规范）：

| 前缀 | 用在 |
| --- | --- |
| `feat:` | 加了新代码 | `feat: 洛谷P1001 A+B` |
| `fix:` | 修了 bug | `fix: 修复数组越界` |
| `docs:` | 只改文档 | `docs: 更新进度看板` |

> [!tip] 别攒着一次性推
> **每天至少推一次，哪怕只写了一行。**
> 半年后面试官看的不是代码量，是**"这半年你有没有连续在写"**。
> 一天的绿格子，胜过一千行的批量上传。

---

## 八、在 IDEA 里怎么推（更省事）

你以后大概率在 IDEA 里写代码，其实不用敲命令：

1. IDEA 打开 `D:\code\java-learning`
2. `Ctrl + K` → 勾选文件 → 写提交信息 → **Commit**
3. `Ctrl + Shift + K` → **Push**

> 但**前两周请用命令行**。命令行的好处是：换任何电脑都能用，出问题你知道发生了什么。
> 用 IDEA 的按钮报错时，你只能干瞪眼。

---

## 九、马上要做的 5 件事

- [ ] **装 Git for Windows**（否则什么都做不了）
- [ ] 决定：删掉旧仓库重建（推荐），还是 `--allow-unrelated-histories` 合并
- [ ] 把 `D:\ds\java-learning` 复制到 `D:\code\java-learning`
- [ ] 配 SSH 密钥，贴到 `gitee.com/profile/sshkeys`
- [ ] 推上去，刷新页面确认目录结构出现
- [ ] 在 Gitee 右侧「关于」填上仓库描述

---

*配套：`README.md`（仓库主页要换成骨架里那份）｜ `D:\ds\Java-Obsidian笔记系统\00-索引\00-AI学习路线总图.md`（学习总纲）*
