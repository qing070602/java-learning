# 推送到 GitHub 指南

> **你的仓库**：https://github.com/qing070602/java-learning
> **本地工作目录**：`D:\code\java-learning`
> **状态**：✅ 骨架已推送（36 个文件，分支 `main`）

---

## 一、当前状态（已经帮你做好的）

| 项目 | 值 |
| --- | --- |
| 远程仓库 | `git@github.com:qing070602/java-learning.git` |
| 本地路径 | `D:\code\java-learning` |
| 默认分支 | `main` |
| 首次提交 | `7fefef3 init: 仓库初始化，建立目录结构` |
| 合并提交 | `ed43429 Merge branch 'main'`（合并了建仓库时自动生成的 Initial commit） |
| SSH 认证 | ✅ 已通（`Hi qing070602! You've successfully authenticated`） |
| 待推送改动 | 0 |

**GitHub 上现在能看到**：README、.gitignore、三份指南、`java-basics/` 等 9 个目录、`algorithm/` 等 13 个目录、`projects/` 4 个目录。

---

## 二、以后的日常（每天就 3 条）

```powershell
cd D:\code\java-learning
git add .
git commit -m "feat: 完成方法章节的递归练习"
git push
```

**就这三条。** 记住它们，你不需要学任何其他 Git 命令。

### 提交信息怎么写

| 前缀 | 什么时候用 | 例子 |
| --- | --- | --- |
| `feat:` | 加了新代码 | `feat: 洛谷P1001 A+B` |
| `fix:` | 修了 bug | `fix: 修复数组越界` |
| `docs:` | 只改文档 | `docs: 更新进度看板` |

> [!tip] 别攒着一次性推
> **每天至少推一次，哪怕只写了一行。**
> 半年后面试官看的不是代码量，是 **"这半年你有没有连续在写"**。
> 一天的绿格子，胜过一千行的批量上传。

---

## 三、代码到底放在哪

**本地一个文件夹（`D:\code\java-learning`），按用途分目录。**

```
D:\code\java-learning\          ← 这个文件夹 = 你的仓库
│
├── README.md                   ← 仓库主页
├── .gitignore
│
├── java-basics\                ← 🎯 上课练习题放这
│   ├── 01-入门语法\
│   ├── 02-方法\
│   ├── 03-面向对象\
│   └── ...（09-JVM探索）
│
├── algorithm\                  ← 🎯 洛谷 / 牛客 / LeetCode 放这
│   ├── 00-模板.md
│   ├── 01-数组\
│   │   ├── P1001-A+B-Problem-入门.java            ← 洛谷（P 开头）
│   │   └── HJ1-字符串最后一个单词的长度-简单.java   ← 牛客（HJ 开头）
│   ├── 02-链表\
│   └── ...（11-图论 + 99-错题重做）
│
├── mysql-practice\             ← SQL 脚本
├── springboot\                 ← 2027-01 开始
├── ai-agent\                   ← 2027-03 开始（Python / RAG / Agent）
│   ├── 01-python-basics\
│   ├── 02-rag\
│   └── 03-agent\
└── projects\                   ← 里程碑项目（能写进简历的）
    ├── 01-图书管理系统\
    ├── 02-校园二手交易平台\
    ├── 03-RAG知识库\
    └── 04-多工具Agent\
```

### 三类题目分别怎么放

| 来源 | 放哪 | 文件命名 |
| --- | --- | --- |
| **上课练习题** | `java-basics/对应章节/` | `ArrayMax.java`（英文驼峰，**文件名=类名**；别用 `Demo1` `Test2`） |
| **洛谷** | `algorithm/对应题型/` | `P1001-A+B-Problem-入门.java` |
| **牛客** | `algorithm/对应题型/` | `HJ1-字符串最后一个单词的长度-简单.java`、`NC68-跳台阶-简单.java` |
| **LeetCode** | `algorithm/对应题型/` | `0001-两数之和-easy.java` |

**关键原则：按「题型」分目录，不按「来源」分。**
洛谷的二分题和 LeetCode 的二分题放一起，复习时才能形成对比。

### 每道题按模板写

用 `algorithm/00-模板.md` 的格式：**题目 → 我的思路（大白话）→ 代码 → 复杂度 → 我踩的坑 → 面试可能追问**。

> [!warning] 两个红线
> 1. **只传公开题库**（洛谷 / LeetCode / 牛客公开题库）。**公司笔试真题绝对不要传** —— 有些签了保密协议。
> 2. **不要原样抄题解**。参考了就写来源链接，**自己重写一遍**再推。

---

## 四、公开还是私有？

**你的仓库已经是公开的，这是对的。**

| | 公开 | 私有 |
| --- | --- | --- |
| 面试官能否看到 | ✅ 能 | ❌ **看不到**，发链接也打不开 |
| 绿格子贡献图 | ✅ 有（求职时很有用） | ❌ 不显示 |

> [!important] 关键认知
> **"公开"本身不是风险，"公开了不该公开的东西"才是风险。**
> 求职仓库**必须公开**，否则整个仓库白建。
>
> 要守住的只有一条：**别把密钥、密码推上去。**
> `.gitignore` 已经挡掉了 `.env`、`application-local.yml`、`*.pem` 这些。
> 全局忽略规则 `D:\Git\etc\gitignore_global` 也配了同样的规则。

---

## 五、GitHub 上还建议做的两件小事

**① 填仓库描述**

仓库页面右侧「About」→ 齿轮图标 → Description 填：

```
我的 Java / 算法 / AI Agent 学习代码库 | 2026.09 - 至今
```

顺便勾上 Topics：`java` `algorithm` `leetcode` `llm` `agent`

**② 确认邮箱已绑定**

`git config --global user.email` 是 `3596277589@qq.com`。
去 GitHub → Settings → Emails 确认这个邮箱**已添加且已验证**，否则提交不算在你账号头上、**绿格子墙不亮**。

---

## 六、常见问题

| 现象 | 原因 | 解决 |
| --- | --- | --- |
| `failed to push some refs` / `fetch first` | 远程有你本地没有的提交 | `git pull origin main --allow-unrelated-histories --no-rebase -X ours --no-edit` 再 push |
| `Permission denied (publickey)` | SSH 没配好 | `ssh -T git@github.com` 测试；确认远程地址是 `git@` 开头 |
| `git : 无法将"git"项识别为...` | 终端是装 Git 之前开的 | **关掉重开**（PATH 是启动快照） |
| 中文文件名显示成 `\346\226\207` | quotepath | 已配好 `core.quotepath=false`，正常不会有 |
| 绿格子不亮 | 提交邮箱和账号邮箱不一致 | 见第五节 ② |

---

## 七、这个仓库的意义

半年后你会投简历。简历上只能写 1 页，
**"项目经历"那两行文字的背后，就是这个仓库。**

面试官点进来会看：
- ✅ 有没有连续提交（说明你真的在坚持，不是临时包装）
- ✅ 项目有没有 README 和架构图（说明你会表达、会总结）
- ✅ 算法题的注释里有没有自己的思考（说明你是真的会，不是背的）

**所以：从今天开始，写一行推一行。**

---

*仓库地址：https://github.com/qing070602/java-learning ｜ 本地路径：`D:\code\java-learning`*
