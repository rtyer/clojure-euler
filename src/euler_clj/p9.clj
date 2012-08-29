(ns euler-clj.p9)

;A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
;For example, 32 + 42 = 9 + 16 = 25 = 52.

;There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;Find the product abc.
Xo
;find all triples that sum to 1k and meet condition of a<b<c
;filter to find the triple
;calc their product
(defn sqr [n] (* n n))

(def possibles (for [a (range 1 1000)
                     b (range a 1000)
                     :let [c (- 1000 a b)]
                     :when (< a b c)
                     :when (= (sqr c) (+ (sqr a) (sqr b)))]
                 (* a b c)))

(println (time (take 1 possibles)))
                 