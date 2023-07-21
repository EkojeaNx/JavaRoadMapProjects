/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 3 */
-- 1. country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.
SELECT c.country FROM country c WHERE c.country LIKE 'A%a';
-- 2. country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.
SELECT c.country FROM country c WHERE c.country LIKE '%_____n';
-- 3. film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.
SELECT f.title FROM film f WHERE f.title ILIKE '%T%T%T%T%';
-- 4. film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan verileri sıralayınız.
SELECT f.* FROM film f WHERE f.title LIKE 'C%' AND f.length > 90 AND f.rental_rate = 2.99;