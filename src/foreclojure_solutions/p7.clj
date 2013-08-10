(ns foreclojure-solutions.p7
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Vectors: conj"
  __ => (conj [1 2 3] 4)
  __ => (conj [1 2] 3 4))
