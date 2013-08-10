(ns foreclojure-solutions.p99
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Product Digits"
  (__ 1 1) => [1]
  (__ 99 9) => [8 9 1]
  (__ 999 99) => [9 8 9 0 1])
