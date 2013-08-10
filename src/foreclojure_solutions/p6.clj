(ns foreclojure-solutions.p6
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Vectors"
  (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c)) => true)
