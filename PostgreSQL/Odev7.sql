/* Orta Seviye Java ile Web Development Patikası Eğitimi - SQL Bölümü - Ödev 7 */
-- 1. film tablosunda bulunan filmleri rating değerlerine göre gruplayınız.
SELECT f.rating FROM film f GROUP BY f.rating;
-- 2. film tablosunda bulunan filmleri replacement_cost sütununa göre grupladığımızda film sayısı 50 den fazla olan replacement_cost değerini ve karşılık gelen film sayısını sıralayınız.
SELECT f.replacement_cost, COUNT(*) FROM film f GROUP BY f.replacement_cost HAVING COUNT(*) > 50;