1.在安装Linux的过程中的第五步是让用户选择安装方式，如果用户希望安装部分组件（软件程序），并在选择好后让系统自动安装，应该选择的选项是___
	A. full
	B. expert
	C. newbie
	D. menu  "√"


/****************************************/
2.启动samba服务器进程，可以有两种方式：独立启动方式和父进程启动方式，其中前者是在___文件中以独立进程方式启动
	A. /usr/sbin/smbd
	B. /usr/sbin/nmbd
	C. rc.samba   "√"
	D. /etc/inetd.conf


/****************************************/
3.在LVM文件系统中，如果PE的大小是16MB，那么请问，该LVM中VG最大是多少？
	A. 512G
	B. 256G   
	C. 128G
	D. 1T  "√"

	"4 MB 的PE决定了单个逻辑卷最大容量为 256 GB"



/****************************************/
4.下面哪个命令刷新打印机队列？
	A. lprm -    "√"   
	B. lprm all  打印队列删除所有任务
	C. lpflush
	D. lpclear




/****************************************/
5.echo $((${a//.*/+1}))是什么意思 
	向上取整

/****************************************/
6.linux启动时最先运行的进程是哪一个？
	init
/****************************************/
7.下列哪种方式可以最快捷地让一个普通用户变成root？
	A. /etc/passwd 权限修改为 -rw-r--rw-  "√"
	B. 具有/etc/inittab 文件写的权限
	C. /etc/shadow 权限修改为 -rw-r--r-

/****************************************/
8.不是shell具有的功能和特点的是
	A. 管道
	B. 输入输出重定向
	C. 执行后台进程  "√"
	D. 处理程序命令
/****************************************/
9.如果有三个进程共享同一程序段，而且每次最多允许两个进程进入该程序段，则信号量的初值应设置为______。
	A. 3
	B. 2  "√"
	C. 1  
	D. 0

/****************************************/

10.以下_____操作系统中的技术是用来解决进程同步的。
	A. 管道
	B. 管程 "√"
	C. 通道
	D. DMA
/****************************************/
11.信号灯可以用来实现进程之间的______。
	A. 调度
	B. 同步与互斥  "√"
	C. 同步
	D. 互斥
/****************************************/
12.以下关于临界区的说法，______是正确的。
	A. 对于临界区，最重要的是判断哪个进程先进入
	B. 若进程A已进入临界区，而进程B的优先级高于进程A，则进程B可以打断进程A而自己进入临界区
	C. 信号量的初值非负，在其上只能做P、V操作  "√"
	D. 两个互斥进程在临界区内，对共享变量的操作是相同的
/****************************************/
13.临界区是_____。
	A. 一个缓冲区
	B. 一段数据区
	C. 一段程序  "√"
	D. 栈
/****************************************/
14.以下关于P、V操作的描述_______正确。
	A. 机器指令
	B. 系统调用
	C. 高级通信原语  	
	D. 低级通信原语 "√"	
/****************************************/
15.在消息缓冲通信中，消息队列是一种__"临界"__资源。
/****************************************/
16.同步是指进程之间逻辑上的___"制约"___关系。

/****************************************/
17.分时操作系统的主要目标是 ( )
	A. 提高计算机系统的实时性
	B. 提高计算机系统的利用率
	C. 提高软件的运行速度
	D. 提高计算机系统的交互性 "√"	
/****************************************/
18.分时操作系统追求的目标是 ( )
	A. 高吞吐量   "√"
	B. 充分利用内存
	C. 快速响应
	D. 建设系统开销
/****************************************/
19.计算机系统中设置的访管指令 ( )
	A. 只能在目录下执行
	B. 只能在管态下执行
	C. 既可在目态又可在管态下执行  "√"
	D. 在目态和管态下都不能执行
/****************************************/
20.在程序状态字PSW中设置了一位,用于控制用户程序不能执行特权指令,这一位是 ( )
	A. 保护位  "√"
	B. CPU状态位
	C. 屏蔽位
	D. 条件位
/****************************************/
21.实时操作系统的主要目标是"高度可靠性"
/****************************************/
22.中断扫描机构什么时候扫描一次中断寄存器
	A. 每隔一个时间片
	B. 每条指令执行周期内最后时刻
	C. 每当进程释放CPU  "√"
	D. 每产生一次中断
/****************************************/
23.多道系统环境下,操作系统分配资源是以什么为基本单位的 "进程"
/****************************************/
24.中断扫描机构什么时候扫描一次中断寄存器  "每条指令执行周期内最后时刻"
/****************************************/
25.用down和up操作可以解决进程间的各种同步互斥问题，下列说法中哪个正确：
Ⅰ.两个down操作的顺序无关紧要 Ⅱ.用于互斥的down操作应在用于同步的
down操作之前 Ⅲ.用于同步的down操作应在用于互斥的down操作之前
	A. 只有Ⅰ
	B. 只有Ⅱ
	C. 只有Ⅲ   "√"
	D. 都不正确
/****************************************/
26.下列哪一个不是死锁产生的必要条件
	A. 无限等待（饥饿）   "√"
	B. 不可抢占(不可剥夺)
	C. 循环等待
	D. 互斥使用
/****************************************/

/****************************************/
/****************************************/
/****************************************/
/****************************************/


/****************************************/
/****************************************/
/****************************************/

/****************************************/
/****************************************/
/****************************************/
/****************************************/

/****************************************/