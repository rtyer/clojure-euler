(ns euler-clj.p3)

;The prime factors of 13195 are 5, 7, 13 and 29.

;What is the largest prime factor of the number 600851475143 ?

; what is a prime factor????  -- divides int evenly and is prime

(defn divisors
  [n]
  (filter #(zero? (mod n %)) 
          (range 2 (inc (Math/sqrt n)))))

(defn prime?
  [n]
  (empty? (divisors n)))

(defn prime-factors
  [n]
  (filter prime? (divisors n)))

(time (reduce max (prime-factors 600851475143)))