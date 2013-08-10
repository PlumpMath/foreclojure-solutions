(ns foreclojure-solutions.p42
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Factorial Fun"
  (__ 1) => 1
  (__ 3) => 6
  (__ 5) => 120
  (__ 8) => 40320)
