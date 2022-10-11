--Select seç komutu
--ANSI Standardı
select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

select * from Customers where City= 'London'

--case insensitive-büyük küçük harf duyarsız
select * from Products where CategoryID=1 or CategoryID=3

select * from Products where CategoryID=1 and UnitPrice>010

select * from Products order by CategoryID,ProductName

select * from Products order by UnitPrice asc   --asc artan demektir
select * from Products order by UnitPrice desc -- desc azalan demek 
--order by sırala demektir
select * from Products where CategoryID=1 order by UnitPrice desc

select COUNT(*) from Products --count adet demek--ne kadar ürün varsa say demektir.

select CategoryID,count(*) from Products group by CategoryID

select CategoryID,count(*) from Products group by CategoryID having COUNT(*)<10 --having i kümülatiflere uygularız yani count a uygulanır

select CategoryID,count(*) from Products where UnitPrice>20 group by CategoryID having COUNT(*)<10  
--birim fiyatı 20 den fazla olan ürünleri categoryıd ye göre grupla, onlardan da sayısı 10 dan küçük olanları listele

--join demek birleştirmek demektir
--iki ayrı tablodan istediğimiz verileri getirir
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID
where Products.UnitPrice>10

--DTO= Data Transformation Object
--inner join sadece iki tablodada eşlesen verileri bize getirir. eşleşmeyeni getirmez bu nedenle

select * from Products p left join [Order Details] od   --left solda olup sağda olmayanlarıda getir
on p.ProductID=od.ProductID 

select * from Customers c left join Orders o
on c.CustomerID=o.CustomerID
where o.CustomerID is null  --null siparişlerde gelmeyen data demektir. is null pk ya uygulanır

--ikiden fazla tabloyu join etmek için

select * from Products p inner join [Order Details] od
on p.ProductID=od.ProductID
inner join Orders o
on o.OrderID=od.OrderID --yapılır













