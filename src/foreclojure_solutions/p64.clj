(ns foreclojure-solutions.p64
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Reduce"
  15 => (reduce __ [1 2 3 4 5])
  0 => (reduce __ [])
  6 => (reduce __ 1 [2 3]))
