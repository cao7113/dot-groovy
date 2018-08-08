#!/usr/bin/env groovy

println '==use local shared lib'

import static Hi.hi
hi 'geeks'

import dot.DotHi
DotHi.dotHi 'geeks'

import static dot.DotHi.dotHi
dotHi 'geeks'
