(ns p7)

;; need to make a sieve for primes

(defn divisors
  [n]
  (filter #(zero? (rem n %)) (range 2 n)))

(defn prime?
  [n]
  (zero? (count (divisors n))))

(println
  (nth 
    (filter prime? 
            (iterate inc 1))
    10001))

