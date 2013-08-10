(ns foreclojure-solutions.p5
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Lists: conj"
  __ => (conj '(2 3 4) 1)
  __ => (conj '(3 4) 2 1))
