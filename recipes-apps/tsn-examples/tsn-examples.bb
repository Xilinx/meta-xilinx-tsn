SUMMARY = "Talker/listener example applications demonstrating \
Time-Sensitive Networking (TSN) traffic flows on AMD Xilinx TSN \
endpoints."
DESCRIPTION = "TSN talker listner examples"
LICENSE = "LGPL-2.1-only & BSD-3-Clause & GPL-2.0-only & MIT"
LIC_FILES_CHKSUM = " \
	file://LICENSE.md;md5=0d4e0ec48c9308a5132d608a615aed9a \
	file://OpenAvnu/README.rst;beginline=41;endline=58;md5=421b581669f30d492238ab13a0b86cbd \
"

BRANCH = "main"
SRC_URI = " \
	gitsm://github.com/Xilinx/tsn-talker-listener.git;branch=${BRANCH};protocol=https \
	file://0001-openavb_tasks-Add-missing-include-file.patch \
	file://0001-openavb_avb_gptp_h_false.patch \
	file://0001-openavnu-ring_rawsock.c-Add-missing-poll.h.patch \
"
SRCREV = "04c87d740903944827a7da10fe38d1e258d24580"

inherit autotools-brokensep

do_configure[noexec] = '1'
