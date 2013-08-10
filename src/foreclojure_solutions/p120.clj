(ns foreclojure-solutions.p120
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sum of square of digits"
  8 => (__ (range 10))
  19 => (__ (range 30))
  50 => (__ (range 100))
  50 => (__ (range 1000)))
