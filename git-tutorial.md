#Git简易教程及团队项目协作


##Git是什么？为什么Git如此重要？
  - 代码版本管理
  - 团队协作
  - 几乎所有公司都用
  - 简单易学
  - 非常强大
  

##Git基本操作
所有的Git命令都是以git 开头。
#### 新建Git项目
`git init`

#### Git 基本概念
- 工作目录
- 暂存区域
- 本地仓库

#### 添加本地文件
`git add filename.txt` 添加某个文件

`git add -A` 或者 `git add .` 添加所有文件


#### 查看工作目录状态
`git status` 

#### 查看本地工作区的改动
`git diff -- filename.txt` 查看单个文件的改动

`git diff ` 查看工作区所有文件的改动

`git diff --cached` 查看***已加入暂存区域*** 但 **还未提交到本地仓库****的文件改动

#### 撤销改动
######1. 还未提交到暂存区域的情况
`git checkout -- filename.txt`

######2. 已提交到暂存区域的情况
`git reset HEAD -- filename.txt` 还原已加入缓存区的文件到工作区

`git checkout -- filename.txt` 撤销该文件的改动

#### 提交到本地仓库
`git commit` 提交在Vim中填写commit信息

`git commit -m "commit message"` 提交到本地仓库并快捷填写commit信息

#### 更新最近一次的提交信息
`git commit --ammend -m "update message"`

#### 查看提交日志
`git log` 查看详细的提交日志

`git log --stat` 查看提交里面改动的文件信息

#### 克隆远程仓库
`git clone git@github.com:Geowind/LearnGit.git` 本地不存在该远程仓库的前提下clone该远程仓库

#### 关联远程仓库
`git remote add origin git@github.com:Geowind/LearnGit.git` 远程仓库为空，讲远程仓库和本地仓库关联起来


#### 拉取远程仓库代码并合并
`git pull --rebase`

#### 修复冲突
`git add conflict_file.txt` 先添加已修复冲突的文件到暂存区

`git rebase --continue` 继续之前的合并操作

#### 推送到远程仓库
`git push origin master` 推送到远程仓库的 **master** 主分支

#### 创建子分支
`git branch dev` 创建一个名为 **dev** 的子分支

`git checkout dev` 从当前分支切换到 **dev** 分支

#### 切换分支
`git checkout dev` 从当前分支切换到 **dev** 分支

创建子分支也可以用这一条命令 `git checkout -b dev`

#### 查看所有分支（包括远程分支）
`git branch -av` **-a** 查看所有分支 **-v** 查看分支详细信息

#### 合并分支
`git meger dev` 合并 **dev** 分支到当前分支

#### 删除分支
`git branch dev -d` 删除 **dev** 分支

#### Stash 的使用
`git stash` 存档当前项目代码

`git stash pop` 恢复最新存档代码到工作区域**并且不保留存档**

`git stash apply`  恢复最新存档代码到工作区域**仍然保留存档**

`git stash list` 查看所有存档

#### Git ignore
忽略不想添加到Git仓库的文件。

git ignore文件汇总：[git@github.com:github/gitignore.git](https://github.com/github/gitignore)

####Git 图形界面的工具
Git GUI,Gittortoise,SmartGit，Github客户端等

####其他Git代码托管网站
######1.国内
[开源中国Git](https://git.oschina.net/),[Coding.net](http://coding.net),[GitCafe](http://gitcafe.com),[CSDN Code](http://code.csdn.net/)

###### 2.国外
[GitLab](http://gitlab.com), [Bitbucket](www.bitbucket.org/)
##Git远程库和团队协作

以Github项目为例。
####生成ssh-key
`ssh-keygen -t rsa -C "youremail@example.com"`

#### 给Github账号添加ssh-key
在 **~/.ssh** 目录下面找到 **id_rsa.pub** 文件，把ssh-key的内容添加到 **Github>Setting>SSH Keys** 里面。

#### Github Respository Issue
在github项目首页提交 ***issue***。

#### Github Repository Pull Request
先 ***Fork*** 某个项目，然后提交改动，然后提交 ***Pull Request***。