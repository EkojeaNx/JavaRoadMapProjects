# Kullanılan Veritabanı Hakkındaki Bilgiler
1. Kullanılan Veritabanı Programı : [PostgreSQL](https://www.postgresql.org/download/) 
2. Kullanılan Veritabanı : [DVDRental](https://www.postgresqltutorial.com/postgresql-getting-started/postgresql-sample-database/)

# SQL Eğitimindeki Öğrendiklerim
- Select Anahtar Kelimesi (Tablo Sorgulama)
```
SELECT * FROM <Tablo Adı>; -- Tabloya ait tüm sütunları ile verili listeleme
SELECT <Sütun Adı>, <Sütun Adı> FROM <Tablo Adı>; -- Tabloya ait sadece istenilen sütunlar ile listeleme
```
- WHERE Anahtar Kelimesi (Koşullu Sorgulama)
```
SELECT <Sütun Adı>, <Sütun Adı> FROM <Tablo Adı> WHERE <Koşul>; -- Tabloya ait sadece istenilen sütunları koşula bağlı olarak listeleme
SELECT <Sütun Adı>, <Sütun Adı> FROM <Tablo Adı> WHERE <Koşul> AND <Koşul>; -- Tabloya ait sadece istenilen sütunları birden fazla koşula bağlı olarak listeleme
SELECT <Sütun Adı>, <Sütun Adı> FROM <Tablo Adı> WHERE <Koşul> OR <Koşul>; -- Tabloya ait sadece istenilen sütunları 2 koşuldan biri sağlanmasına bağlı olarak listeleme
```
- BETWEEN Anahtar Kelimesi (2 Değer Arasında Koşul Sağlama)
```
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> BETWEEN <İlk Değer> AND <Son Değer>;
```
- IN Anahtar Kelimesi (İçerisinde Geçen Değer Koşulu Sağlama)
```
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> IN (<Değer 1>,<Değer 2>);
```
- LIKE Anahtar Kelimesi (İçerisinde Geçen Belirli veya Belirsiz Koşul Sağlama)
```
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> LIKE ('<Değer>%'); -- Başında istenen değer olup sonunda ne olduğu bilinmeyen değeri sorgulama
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> LIKE ('%<Değer>%'); -- İçinde istenen değer olup başında ve sonunda ne olduğu bilinmeyen değeri sorgulama
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> LIKE ('%<Değer>'); -- Sonunda istenen değer olup başında ne olduğu bilinmeyen değeri sorgulama
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> LIKE ('___'); -- Konulan _ kadar  harfli değeri sorgulama
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> LIKE ('N_%'); -- ilk harfi büyük 'N' olup en az 2 harfli olup sonunda ne olduğu bilinmeyen değeri sorgulama
```
- ILIKE Anahtar Kelimesi (İçerisinde Geçen Büyük ve Küçük Harfe Bakmaksızın Koşul Sağlama)
```
SELECT * FROM <Tablo Adı> WHERE <Sütun Adı> ILIKE ('%<Değer>%'); -- İçinde istenen değer büyük veya küçük harf olup başında ve sonunda ne olduğu bilinmeyen değeri sorgulama
```
- DISTINCT Anahtar Kelimesi (Belirtilen Sütundaki Çoğul Değerleri Tekil Hale Getirip Sorgulama)
```
SELECT DISTINCT <Sütun Adı> FROM <Tablo Adı>;
```
- COUNT Anahtar Kelimesi (Sorgulanan Verinin Satır Sayısını Hesaplama)
```
SELECT COUNT(*) FROM <Tablo Adı>;
```
- ORDER BY Anahtar Kelimesi (Sorgulanan Verinin Sıralanması)
```
SELECT <Sütun Adı> FROM <Tablo Adı> ORDER BY <Sütun Adı>; -- Sayı için küçükten büyüğe, harf için A-Z
SELECT <Sütun Adı> FROM <Tablo Adı> ORDER BY <Sütun Adı> ASC; -- Sayı için küçükten büyüğe, harf için A-Z
SELECT <Sütun Adı> FROM <Tablo Adı> ORDER BY <Sütun Adı> DESC; -- Sayı için büyükten küçüğe, harf için Z-A
```
- LIMIT Anahtar Kelimesi (Sorgulanan Verinin Getirmek İstediği Satır Sayısı)
```
SELECT * FROM <Tablo Adı> LIMIT 5; -- Sorguya ait ilk 5 satırı listeleme
```
- OFFSET Anahtar Kelimesi (Sorgulanan Verinin İstenilen Satır Sayısı Kadar Atlayarak Sorgulama)
```
SELECT * FROM <Tablo Adı> OFFSET 5; -- Sorguya ait ilk 5 satırı atlayıp listeleme
```
- AGGREGATE Fonksiyonlar (Hesaplama Fonksiyonları)
```
SELECT MIN(<Sütun Adı>) FROM <Tablo Adı>; -- Belirtilen sütundaki en küçük değeri alan fonksiyon
SELECT MAX(<Sütun Adı>) FROM <Tablo Adı>; -- Belirtilen sütundaki en büyük değeri alan fonksiyon
SELECT SUM(<Sütun Adı>) FROM <Tablo Adı>; -- Belirtilen sütundaki değerleri toplayan fonksiyon
SELECT AVG(<Sütun Adı>) FROM <Tablo Adı>; -- Belirtilen sütundaki değerlerin ortalamasını hesaplayan fonksiyon
```
- GROUP BY Anahtar Kelimesi (Sorguda Gruplama)
```
SELECT <Sütun Adı> FROM <Tablo Adı> WHERE <Koşul> GROUP BY <Sütun Adı>;
```
- HAVING Anahtar Kelimesi (Gruplanmış Sorguda Koşul Arama)
```
SELECT <Sütun Adı> FROM <Tablo Adı> GROUP BY <Sütun Adı> HAVING <Koşul>;
```
- AS(ALIAS) Anahtar Kelimesi (Tablo veya Sütun Adına Kısa İsim Takma)
```
SELECT <Sütun Adı> AS <Geçici Sütun Adı> FROM <Tablo Adı> AS <Geçici Tablo Adı>;
SELECT <Sütun Adı> <Geçici Sütun Adı> FROM <Tablo Adı> <Geçici Tablo Adı>;
```
- CREATE TABLE Anahtar Kelimesi (Tablo Oluşturma)
```
CREATE TABLE <Tablo Adı> (
    <Sütun Adı> <Veri Tipi> <Kısıtlama Adı>,
    ...
    <Sütun Adı> <Veri Tipi> <Kısıtlama Adı>
);
CREATE TABLE <Yeni Tablo Adı> (LIKE <Tablo Adı>); -- Tablonun içerisindeki kayıtlar hariç benzerini yaratmak 
CREATE TABLE <Yeni Tablo Adı> AS SELECT * FROM <Tablo Adı>;  -- Tablonun içerisindeki kayıtlar ile birlikte benzerini yaratmak (Yedek Almak)
```
- INSERT INTO Anahtar Kelimesi (Tabloya Kayıt Ekleme)
```
INSERT INTO <Tablo Adı> (<Sütun Adı>, <Sütun Adı>, <Sütun Adı>)
VALUES
    (<Sütun Değeri>, <Sütun Değeri>, <Sütun Değeri>),
    ...
    (<Sütun Değeri>, <Sütun Değeri>, <Sütun Değeri>);
INSERT INTO <Kayıt Eklenecek Tablo Adı> 
SELECT * FROM <Tablo Adı>; -- Tablodan tüm kayıtları alıp istediğimiz tabloya eklemek
INSERT INTO <Kayıt Eklenecek Tablo Adı> 
SELECT * FROM <Tablo Adı> WHERE <Koşul>; -- Tablodan koşula bağlı kayıtları alıp istediğimiz tabloya eklemek
```
- DROP TABLE Anahtar Kelimesi (Tablo Silme)
```
DROP TABLE <Tablo Adı>;
DROP TABLE IF EXISTS <Tablo Adı>; -- IF EXISTS yanlış tablo olmasına karşı hata alınmasını engeller
DROP TABLE (IF EXISTS) <Tablo Adı>; -- IF EXISTS yanlış tablo olmasına karşı hata alınmasını engeller
```
- UPDATE Anahtar Kelimesi (Tabloda Veri Güncelleme)
```
UPDATE <Tablo Adı> 
SET <Sütun Adı> = <Yeni Değer>,
    ...
    <Sütun Adı> = <Yeni Değer>
WHERE <Koşul>;
UPDATE <Tablo Adı> 
SET <Sütun Adı> = <Yeni Değer>,
    ...
    <Sütun Adı> = <Yeni Değer>
WHERE <Koşul>
RETURNING *; -- Güncelleme yapar aynı zamanda güncelleme yapılan kayıtları listeler
```
- DELETE Anahtar Kelimesi (Tablodan Veri Silme)
```
DELETE FROM <Tablo Adı>
WHERE <Koşul>;
DELETE FROM <Tablo Adı>
WHERE <Koşul>
RETURNING *; -- Kayıtları siler ve silinen kayıtları listeler 
```
- PRIMARY KEY Anahtar Kelimesi (Birincil Anahtar)
```
CREATE TABLE <Tablo Adı> (
    <Sütun Adı> <Veri Tipi> PRIMARY KEY,
    ...
    <Sütun Adı> <Veri Tipi> <Kısıtlama Adı>
); -- Benzersiz sütun değeri verilerek oluşturulmuş tablo
```
- FOREIGN KEY Anahtar Kelimesi (Tablolar Arası İlişki Kurma)
```
CREATE TABLE <Tablo Adı> (
    <Sütun Adı> <Veri Tipi> PRIMARY KEY,
    ...
    <Sütun Adı> <Veri Tipi> <Kısıtlama Adı>,
    <Sütun Adı> <Veri Tipi> REFERENCES <Referans Alınacak Tablo Adı>(<Referans Tablosundaki Sütun Adı>)
); -- Tablolar arasında ilişki kurma
```
- Veri Tipleri (PostgreSQL)
1. Sayısal Veri Tipleri
```
Name                Storage     Description                     Range
                    Size	    	                
-------------------------------------------------------------------------
smallint	       |2 bytes	   |small-range integer	           |-32768 to +32767
integer	           |4 bytes	   |typical choice for integer	   |-2147483648 to +2147483647
bigint	           |8 bytes	   |large-range integer	           |-9223372036854775808 to +9223372036854775807
decimal	           |variable   |user-specified precision, exact|up to 131072 digits before the decimal point; up to|16383 digits after the decimal point
numeric	           |variable   |user-specified precision, exact|up to 131072 digits before the decimal point; up to|16383 digits after the decimal point
real	           |4 bytes	   |variable-precision, inexact	   |6 decimal digits precision
double precision   |8 bytes	   |variable-precision, inexact	   |15 decimal digits precision
smallserial	       |2 bytes	   |small autoincrementing integer |1 to 32767
serial	           |4 bytes	   |autoincrementing integer	   |1 to 2147483647
bigserial	       |8 bytes	   |large autoincrementing integer |1 to 9223372036854775807
```
2. Karakter Veri Tipleri
```
Name	                            |Description
---------------------------------------------------------------
character varying(n), varchar(n)	|variable-length with limit
character(n), char(n)	            |fixed-length, blank padded
text	                            |variable unlimited length
```
3. Boolean Veri Tipleri
```
Name	|Storage Size	|Description
-----------------------------------------------
boolean	|1 byte	        |state of true or false
```
4. Zaman / Tarih Veri Tipleri
```
Name	                                |Storage Size
---------------------------------------------------------
timestamp [ (p) ] [ without time zone ]	|8 bytes	
timestamp [ (p) ] with time zone	    |8 bytes	
date	                                |4 bytes	
time [ (p) ] [ without time zone ]	    |8 bytes	
time [ (p) ] with time zone	            |12 bytes	
interval [ fields ] [ (p) ]	            |16 bytes	
```
5. NOT : Veri Tipi Dönüşümü
```
SELECT (<Değer>::<Değerin Dönüşeceği Veri Tipi>);
```
- NOT NULL Anahtar Kelimesi (Boş Bırakılamaz)
```
CREATE TABLE <Tablo Adı> (
    <Sütun Adı> <Veri Tipi> PRIMARY KEY,
    ...
    <Sütun Adı> <Veri Tipi> NOT NULL
); -- Belirtilen sütunun boş bırakılamaz yapıldı
```
- ALTER TABLE Anahtar Kelimesi (Tablo Üzerinde Değişiklik Yapma)
```
ALTER TABLE <Tablo Adı> ALTER COLUMN <Sütun Adı> SET NOT NULL; -- Bahsi geçen tabloda bahsi geçen sütunu boş bırakılamaz olarak değiştirdik
```
- UNIQUE Anahtar Kelimesi (Sütunda Aynı Veri Olmasını Engelleme)
```
ALTER TABLE <Tablo Adı> ADD UNIQUE(<Sütun Adı>); -- Bahsi geçen tabloda bahsi geçen sütunu değerlerinin aynı olmasını engelledik
```
- CHECK Anahtar Kelimesi (Sütunda Koşul Koyma)
```
ALTER TABLE <Tablo Adı> ADD CHECK(<Koşul>); -- Bahsi geçen tabloda bahsi geçen sütunu koşula bağladık
```
- INNER JOIN Anahtar Kelimesi (Farklı Tabloları Birleştirme)
```
SELECT * FROM <1.Tablo Adı>
INNER JOIN <2.Tablo Adı> ON <1.Tablo Adı>.<Sütun Adı> = <2.Tablo Adı>.<Sütun Adı>; -- 2 Farklı tabloyu eşleştirerek ortak kümesini alıyoruz
```