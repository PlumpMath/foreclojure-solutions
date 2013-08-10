(ns foreclojure-solutions.p116
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Prime Sandwich"
  false => (__ 4)
  true => (__ 563)
  1103 => (nth (filter __ (range)) 15))
