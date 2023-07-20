-- 1. film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.
SELECT f.title, f.description FROM film f;
-- 2. film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.
SELECT f.* FROM film f WHERE f.length > 60 AND f.length < 75;
-- 3. film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.
SELECT f.* FROM film f WHERE f.rental_rate = 0.99 AND (f.replacement_cost = 12.99 OR f.replacement_cost = 28.99);
-- 4. customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?
SELECT c.last_name FROM customer c WHERE c.first_name = 'Mary';
-- 5. film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.
SELECT f.* FROM film f WHERE NOT (f.length > 50) AND NOT (f.rental_rate = 2.99 OR f.rental_rate = 4.99);