FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

ENABLE_TSN ??= "0"

require linux-xlnx-tsn.inc
