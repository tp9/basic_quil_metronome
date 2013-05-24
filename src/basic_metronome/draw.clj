(ns basic-metronome.draw
  (:use [basic-metronome.setup :only [HEIGHT WIDTH tick]])
  (:require [quil.core :as qc]))

(defn draw
  []
  (swap! tick inc)
  (qc/background 0 0 0)
  (qc/translate (* 0.5 WIDTH) (* 0.5 HEIGHT))
  (let [theta (* 0.05 @tick)
        x (* 0.5 WIDTH (Math/sin theta)]
    (qc/ellipse x 0 20 20)))










