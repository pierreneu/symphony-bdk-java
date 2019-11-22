package com.symphony.ms.songwriter.internal.event;

import com.symphony.ms.songwriter.internal.event.model.IMCreatedEvent;
import com.symphony.ms.songwriter.internal.event.model.MessageEvent;
import com.symphony.ms.songwriter.internal.event.model.RoomCreatedEvent;
import com.symphony.ms.songwriter.internal.event.model.RoomDeactivatedEvent;
import com.symphony.ms.songwriter.internal.event.model.RoomMemberDemotedFromOwnerEvent;
import com.symphony.ms.songwriter.internal.event.model.RoomMemberPromotedToOwnerEvent;
import com.symphony.ms.songwriter.internal.event.model.RoomReactivatedEvent;
import com.symphony.ms.songwriter.internal.event.model.RoomUpdatedEvent;
import com.symphony.ms.songwriter.internal.event.model.SymphonyElementsEvent;
import com.symphony.ms.songwriter.internal.event.model.UserJoinedRoomEvent;
import com.symphony.ms.songwriter.internal.event.model.UserLeftRoomEvent;

/**
 * Internal Symphony events listener
 *
 * @author Marcus Secato
 *
 */
public interface InternalEventListener {

  /**
   * Room message event received. Pushes event to CommandFilter for command
   * filtering.
   *
   * @param message
   */
  void onRoomMessage(MessageEvent message);

  /**
   * IM message event received. Pushes event to CommandFilter for command
   * filtering.
   *
   * @param message
   */
  void onIMMessage(MessageEvent message);

  /**
   * Room created event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onRoomCreated(RoomCreatedEvent event);

  /**
   * Room reactivated event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onRoomReactivated(RoomReactivatedEvent event);

  /**
   * Room deactivated event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onRoomDeactivated(RoomDeactivatedEvent event);

  /**
   * Room updated event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onRoomUpdated(RoomUpdatedEvent event);

  /**
   * IM created event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onIMCreated(IMCreatedEvent event);

  /**
   * Room member demoted event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onRoomMemberDemotedFromOwner(RoomMemberDemotedFromOwnerEvent event);

  /**
   * Room member promoted event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onRoomMemberPromotedToOwner(RoomMemberPromotedToOwnerEvent event);

  /**
   * User joined room event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onUserJoinedRoom(UserJoinedRoomEvent event);

  /**
   * User left room event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onUserLeftRoom(UserLeftRoomEvent event);

  /**
   * Symphony elements event received. Pushes event to EventDispatcher.
   *
   * @param event
   */
  void onElementsAction(SymphonyElementsEvent event);

}
