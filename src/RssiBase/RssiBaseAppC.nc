/*
 * Copyright (c) 2008 Dimas Abreu Dutra
 * All rights reserved
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * - Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the
 *   distribution.
 * - Neither the name of the Stanford University nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL DIMAS ABREU
 * DUTRA OR HIS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * @author Dimas Abreu Dutra
 */

#include "../RssiDemoMessages.h"
#include "message.h"

configuration RssiBaseAppC {
} implementation {
  components BaseStationC;
  components RssiBaseC as App;
  
  // need to have this component to be able to work with commands send via serial
  components SerialActiveMessageC as Serial;
  
  components ActiveMessageC, MainC, LedsC;  
  components new AMSenderC(AM_PINGMSG) as PingMsgSender;
  components new TimerMilliC() as SendTimer;
  components new TimerMilliC() as AliveTimer;

#ifdef __CC2420_H__
  components CC2420ActiveMessageC;
  App -> CC2420ActiveMessageC.CC2420Packet;
#elif  defined(PLATFORM_IRIS)
  components  RF230ActiveMessageC, PacketField;
  App -> RF230ActiveMessageC.PacketRSSI;
#elif defined(TDA5250_MESSAGE_H)
  components Tda5250ActiveMessageC;
  App -> Tda5250ActiveMessageC.Tda5250Packet;
#endif
	
// interceptors for radio messages - may be processed
  App.SimpleRssiMsgIntercept -> BaseStationC.RadioIntercept[AM_RSSIMSG];
  App.CommandMsgIntercept -> BaseStationC.RadioIntercept[AM_COMMANDMSG];
  App.RssiMsgIntercept->BaseStationC.RadioIntercept[AM_MULTIPINGRESPONSEMSG];
// serial interceptors - do not forward messages for myself
  App.SerialCommandIntercept->BaseStationC.SerialIntercept[AM_COMMANDMSG];
// sending reports to UART via queue
  App.UartAMSend -> BaseStationC.SerialSend[AM_MULTIPINGRESPONSEREPORTMSG];
  App.UartCmdAMSend -> BaseStationC.SerialSend[AM_MULTIPINGRESPONSEREPORTMSG];
 // split controll notifiers
  App.RadioControl -> BaseStationC.BSRadioControl;
  App.SerialControl -> BaseStationC.BSSerialControl;
  
  App.Boot -> MainC;
  App.SendTimer -> SendTimer;
  App.AliveTimer -> AliveTimer;
  App.PingMsgSend -> PingMsgSender;
  //App.RadioControl -> ActiveMessageC;
  App.Leds -> LedsC;
  App.Packet -> PingMsgSender;
  App.AMPacket -> PingMsgSender;
  
  App.RadioPacket -> ActiveMessageC;
  App.RadioAMPacket -> ActiveMessageC;
  
  App.UartPacket -> Serial;
  App.UartAMPacket -> Serial;
}
