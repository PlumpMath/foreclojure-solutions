(ns foreclojure-solutions.p137
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Digits and bases"
  [1 2 3 4 5 0 1] => (__ 1234501 10)
  [0] => (__ 0 11)
  [1 0 0 1] => (__ 9 2)
  [1 0] => (let [n (rand-int 100000)](__ n n))
  [16 18 5 24 15 1] => (__ Integer/MAX_VALUE 42))
