/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 6 */
-- 1. film tablosunda bulunan rental_rate sütunundaki değerlerin ortalaması nedir?
SELECT ROUND(AVG(f.rental_rate), 2) FROM film f;
-- 2. film tablosunda bulunan filmlerden kaç tanesi 'C' karakteri ile başlar?
SELECT COUNT(f.*) FROM film f WHERE f.title LIKE 'C%';
-- 3. film tablosunda bulunan filmlerden rental_rate değeri 0.99 a eşit olan en uzun (length) film kaç dakikadır?
SELECT MAX(f.length) FROM film f WHERE f.rental_rate = 0.99;
-- 4. film tablosunda bulunan filmlerin uzunluğu 150 dakikadan büyük olanlarına ait kaç farklı replacement_cost değeri vardır?
SELECT COUNT(DISTINCT f.replacement_cost) FROM film f WHERE f.length > 150;