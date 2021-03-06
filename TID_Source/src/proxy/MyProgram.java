package proxy;

import java.util.ArrayList;

// 프록시 : 대리인
// 무거운 프로그램을 대리인이 대신 진행하는 형태
// 가벼운 기능은 프록시가, 정말 필요한 무거운 일에만 실체 클래스가 일한다.

// ex) 유투브의 마우스 오버시 제목을 가져오고 / 프리뷰 재생 기능
// 제목을 가져오는 경우는 프록시로 / 프리뷰를 재생하는건 실체 클래스를 통해 일한다.

public class MyProgram {
  public static void main(String[] args) {
    ArrayList<Thumbnail> thumbnails = new ArrayList<Thumbnail>();

    thumbnails.add(new ProxyThumbnail("Git 강좌", "/git.mp4"));
    thumbnails.add(new ProxyThumbnail("Rest API란?", "/rest-api.mp4"));
    thumbnails.add(new ProxyThumbnail("도커 사용법", "/docker.mp4"));
    thumbnails.add(new ProxyThumbnail("객체지향 프로그래밍", "/oodp.mp4"));
    thumbnails.add(new ProxyThumbnail("블록체인의 원리", "/blockchain.mp4"));

    for (Thumbnail thumbnail : thumbnails) {
      thumbnail.showTitle();
    }
    // 제목:Git 강좌
    // 제목:Rest API란?
    // 제목:도커 사용법
    // 제목:객체지향 프로그래밍
    // 제목:블록체인의 원리

    thumbnails.get(2).showPreview();
    thumbnails.get(2).showPreview();
    thumbnails.get(4).showPreview();
    thumbnails.get(1).showPreview();

    // /docker.mp4로부터 도커 사용법의 영상 데이터 다운
    // 도커 사용법의 프리뷰 재생
    // 도커 사용법의 프리뷰 재생
    // /blockchain.mp4로부터 블록체인의 원리의 영상 데이터 다운
    // 블록체인의 원리의 프리뷰 재생
    // /rest-api.mp4로부터 Rest API란?의 영상 데이터 다운
    // Rest API란?의 프리뷰 재생
  }
}