(ns foreclojure-solutions.p115
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "The Balance of N"
  true => (__ 11)
  true => (__ 121)
  false => (__ 123)
  true => (__ 0)
  false => (__ 88099)
  true => (__ 89098)
  true => (__ 89089)
  (= (take 20 (filter __ (range)))
     [0 1 2 3 4 5 6 7 8 9 11 22 33 44 55 66 77 88 99 101])   => true)
