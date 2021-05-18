create database QuanLyKhachHang
use QuanLyKhachHang
create table KhachHang(
	MaKH nvarchar(10) primary key,
	Hoten nvarchar(30),
	Diachi nvarchar(40),
	Ngaysinh date,
	Socmt nvarchar(20),
	Sodt nvarchar(20),
	Loaitk int,
	Tinhtrang int,
)
drop table KhachHang
insert into KhachHang values
('KH001','Bang','BN','05/12/2000','123456789','0976123321',1,1)
select * from KhachHang
