(ns foreclojure-solutions.p113
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Making Data Dance"
  "1, 2, 3" => (str (__ 2 1 3))
  '(2 1 3) => (seq (__ 2 1 3))
  '(2 1 3) => (seq (__ 2 1 3 3 1 2))
  '(1) => (seq (apply __ (repeat 5 1)))
  "1, 1, 1, 1, 1" => (str (apply __ (repeat 5 1)))
  (and (= nil (seq (__)))
       (=  "" (str (__)))) => true)
