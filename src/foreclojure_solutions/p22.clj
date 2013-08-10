(ns foreclojure-solutions.p22
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Count a Sequence"
  (__ '(1 2 3 3 1)) => 5
  (__ "Hello World") => 11
  (__ [[1 2] [3 4] [5 6]]) => 3
  (__ '(13)) => 1
  (__ '(:a :b :c)) => 3)
