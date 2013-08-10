(ns foreclojure-solutions.p56
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Find Distinct Items"
  (__ [1 2 1 3 1 2 4]) => [1 2 3 4]
  (__ [:a :a :b :b :c :c]) => [:a :b :c]
  (__ '([2 4] [1 2] [1 3] [1 3])) => '([2 4] [1 2] [1 3])
  (__ (range 50)) => (range 50))
