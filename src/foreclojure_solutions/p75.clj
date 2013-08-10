(ns foreclojure-solutions.p75
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Euler's Totient Function"
  (__ 1) => 1
  (= (__ 10) (count '(1 3 7 9)) 4) => true
  (__ 40) => 16
  (__ 99) => 60)
