# Kullanılan Veritabanı Hakkındaki Bilgiler
1. Kullanılan Veritabanı Programı : [PostgreSQL](https://www.postgresql.org/download/) 
2. Kullanılan Veritabanı : [DVDRental](https://www.postgresqltutorial.com/postgresql-getting-started/postgresql-sample-database/)

# SQL Sorgular
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