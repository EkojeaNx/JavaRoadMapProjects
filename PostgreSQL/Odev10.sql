/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 10 */
-- 1. city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
SELECT c.city, ct.country FROM city c
LEFT JOIN country ct ON ct.country_id = c.country_id;
-- 2. customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.
SELECT p.payment_id, c.first_name, c.last_name FROM customer c
RIGHT JOIN payment p ON p.customer_id = c.customer_id;
-- 3. customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz FULL JOIN sorgusunu yazınız.
SELECT r.rental_id, c.first_name, c.last_name FROM customer c
FULL JOIN rental r ON r.customer_id = c.customer_id;