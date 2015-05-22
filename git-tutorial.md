#Git简易教程及团队项目协作


##Git是什么？为什么Git如此重要？
  - 代码版本管理
  - 团队协作
  - 几乎所有公司都用
  - 简单易学
  - 非常强大
  

##Git基本操作
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

以上两条命令可以合并成一条 `git checkout -b dev`

#### 查看所有分支（包括远程分支）
`git branch -av` **-a** 查看所有分支 **-v** 查看分支详细信息

#### 合并分支
`git meger dev` 合并 **dev** 分支到当前分支


##Git远程库和团队协作
以Github项目为例。
####生成ssh-key
``
