;Re-implement Map
; 
;Difficulty:	Easy
;Topics:	core-seqs
;
;Map is one of the core elements of a functional programming language.
;Given a function f and an input sequence s, return a lazy sequence 
;of (f x) for each element x in s.
;Restrictions map, map-indexed, mapcat, for

(ns foreclojure-solutions.p118
  (:use midje.sweet)
  (:require [clojure.tools.trace :as t] :reload-all))

(defn __ []
  "Implement me!")

(future-fact "Re-implement Map"
  [3 4 5 6 7] => (__ inc [2 3 4 5 6])
  (repeat 10 nil)
     (__ (fn [_] nil) => (range 10))
  [1000000 1000001] => (->> (__ inc (range))
          (drop (dec 1000000))
          (take 2)))

; need to add an accumuloator to catch the values

(deftrace zmap [f c]
  "reimplement map"
  (loop [fun f coll c acum [] ]
    (conj acum (f (first coll)))
    (recur f (rest coll) acum)))
