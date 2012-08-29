; Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

(ns euler-clj.p6)

(def nums (range 1 101))

(defn square
  [n]
  (* n n))

(defn sum-of-squares
  [r]
  (reduce + (map square r)))

(defn square-of-sum
  [r]
  (square (reduce + r)))

(time
  (-
    (square-of-sum nums)
    (sum-of-squares nums)))