(ns foreclojure-solutions.p71
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Rearranging Code: ->"
  (= (__ (sort (rest (reverse [2 5 4 1 3 6]))))
   (-> [2 5 4 1 3 6] reverse rest sort __)
   5) => true)
