(ns p4
  (:require [clojure.string :as s]))

;;A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.

;;Find the largest palindrome made from the product of two 3-digit numbers.


(defn palindrome?
  [n]
  "see if this puppy is a palindrome"
  (= (str n) (s/reverse (str n))))

(def possibles   
  (for [a (range 100 1000)
        b (range 100 1000)] ;;note, switching the 1000 to a would be better (and save 50% time), but I'm keeping my solution as I came up with them
    (* a b)))

(time
  (reduce max 
        (filter palindrome? possibles)))