(ns foreclojure-solutions.p47
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Contain Yourself"
  (contains? #{4 5 6} __) => true
  (contains? [1 1 1 1 1] __) => true
  (contains? {4 :a 2 :b} __) => true
  (not (contains? '(1 2 4) __)) => true)
