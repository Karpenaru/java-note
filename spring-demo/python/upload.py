import paramiko

# 远程主机信息
hostname = '192.168.37.140'
port = 22
username = 'root'
password = 'lg'

# 本地文件路径和远程目标路径
local_path = 'd:\\code\\java\\java-note\\spring-demo\\target\\spring-demo-0.0.1-SNAPSHOT.jar'
remote_path = '/opt/file/spring-demo-0.0.1-SNAPSHOT.jar'

# 创建 SSH 客户端对象并连接到远程主机
ssh_client = paramiko.SSHClient()
ssh_client.set_missing_host_key_policy(paramiko.AutoAddPolicy())
ssh_client.connect(hostname=hostname, port=port, username=username, password=password)

# 使用 SFTP 协议上传文件
sftp_client = ssh_client.open_sftp()
sftp_client.put(local_path, remote_path)
sftp_client.close()

# 关闭 SSH 连接
ssh_client.close()
