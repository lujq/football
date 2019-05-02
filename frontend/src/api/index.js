import request from '@/utils/request'

export function getStatistic(data) {
  return request({
    url: '/getTotalScoreStatistic',
    method: 'post',
    data: data
  })
}

export function getInitParams() {
  return request({
    url: '/getSeasons',
    method: 'post',
    param: {}
  })
}

export function getDetail(data) {
  return request({
    url: '/getTotalScoreDetail',
    method: 'post',
    data: data
  })
}
