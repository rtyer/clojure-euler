;The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

;Find the sum of all the primes below two million.

(ns euler-clj.p10)  



(defn is-multiple?
  "is x a multiple of n?"
  [n x]
  (and (zero? (mod x n)) (> x n)))

(defn remove-multiples 
  "removes multiples of a number, n, from a seq r"
  [r n]
  (remove #(is-multiple? n %) r))

(defn next-possible
  "find next value (p) that is larger than n in the sequence r"
  [r n]
  (first (doall (filter #(> % n) r))))
 
(defn prime-seq 
 "returns a sequence of primes up to n"
 [n]
 (loop [r (range 2 n)
        n (first r)]
   (let [marked-r (remove-multiples r n)
         next-p (next-possible r n)]
     (if (nil? next-p)
       marked-r
       (recur marked-r next-p)))))

(defn prime-seq-lazy
  ([] (prime-seq-lazy 2 (iterate inc 2)))
  ([n r]
    (if (not (nil? r))      
      (lazy-seq (cons n (prime-seq-lazy (next-possible r n) (remove-multiples r n)))))))
;(reduce + (prime-seq 2e6))
;(println (take-while #(< % 100) (prime-seq-lazy)))