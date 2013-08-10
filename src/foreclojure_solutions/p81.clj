(ns foreclojure-solutions.p81
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Set Intersection"
  (__ #{0 1 2 3} #{2 3 4 5}) => #{2 3}
  (__ #{0 1 2} #{3 4 5}) => #{}
  (__ #{:a :b :c :d} #{:c :e :a :f :d}) => #{:a :c :d})
